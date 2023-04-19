package sealedclass;


sealed interface ITestSealedClass permits Dog{
	void run();
}
