package ua.lviv.lgs;

public class main {
public static void main(String[] args) {
	
	Voises cow = () -> System.out.println("� ������- ����-����");
	Voises cat = () -> System.out.println("� ��- �����-�����");
	Voises dog = () -> System.out.println("� ��� - �����-�����");
	
	cow.voice();
	cat.voice();
	dog.voice();
	
	
}
}


interface Voises  {
	void  voice();
}