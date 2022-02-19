package oop.nestedclass.step1;

public class Test1 {

  public static void main(String[] args) {
    MyList myList = new MyList();
    myList.add("기아타이거즈");
    myList.add("NC");
    myList.add("SK");
    myList.add("키움");
    myList.add("삼성라이온즈");

    for(int i = 0 ; i < MyList.size(); i++) {
      System.out.println(myList.get(i));
    }
    System.out.println(mylist.size());
  }

}



