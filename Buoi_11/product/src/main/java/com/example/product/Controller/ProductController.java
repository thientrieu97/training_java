package com.example.product.Controller;

import com.example.product.Service.IProductService;
import com.example.product.entity.Product;
import com.example.product.model.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Value("${upload.path}")
    private String fileUpload;

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/product/list");
        List<Product> products = (List<Product>) productService.findAll();
        modelAndView.addObject("products", products);
        System.out.println(products);
//        modelAndView.addObject("message", "Thanh cong");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("product", new ProductForm());
        return modelAndView;
    }

    @PostMapping("/create")
    public RedirectView createProduct(@ModelAttribute ProductForm product){
        Product product1 = new Product.ProductBuilder(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
        MultipartFile multipartFile = product.getImage();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(product.getImage().getBytes(), new File(this.fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        product1.setImage(fileName);
        productService.save(product1);
        return new RedirectView("uploadsuccess");
    }

    @GetMapping("/uploadsuccess")
    public ModelAndView uploadsuccess(){
        ModelAndView modelAndView = new ModelAndView("/product/uploadsuccess");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam long id){
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        Optional<Product> product1 = productService.findById(id);
        System.out.println("product : " + product1);
        Product product = product1.get();
        modelAndView.addObject("product", product);
        File file = new File(fileUpload + product.getImage());
        BufferedImage img = null;
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (img == null) {
            System.out.println("Failed to read image file");
        } else {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                ImageIO.write(img, "png", baos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            Base64.getEncoder().encodeToString(baos.toByteArray());
            modelAndView.addObject("image", Base64.getEncoder().encodeToString(baos.toByteArray()));

        }
        return modelAndView;
    }


}
