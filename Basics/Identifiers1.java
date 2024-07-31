class Identifiers1{
public static void main(String args[]){
int a=10;
int $=20;
int _=30; // Valid till Java -8

System.out.println(a);
System.out.println($);
System.out.println(_);


int 1=10; // It will throw CTE, because the identifier in Java can't start with a number.

int a1=100;
int $1=200;
int _1=300;

System.out.println(a1);
System.out.println($1);
System.out.println(_1);

int cyber =10;
int CYBER =20;

System.out.println(cyber);
System.out.println(CYBER);

}
}