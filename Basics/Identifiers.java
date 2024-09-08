/*
 - Names given to a variable, method, and class are known as identifiers.
 - Identifiers naming rules :-
 1. A valid identifier in Java can start with a letter(a-z/A-Z), dollar symbol($), or an underscore( _ ).
 2. We can't start an identifier with a number.
 3. We can use number after a letter, dollar symbol, or an underscore.
 5. In Java there is no limit for identifier's name, however as a proffessional coding standard we always maintain the length between 10-15 characters.
 5. We can declare two variables with same identifier but in different case.
 6. Reserved keywords can't be used as identifiers. There are 53 reserved keywords in Java.
 7. A valid identifier can contain name of class and method but it is not recommeded practice as proffessional.
 */
class Identifiers {
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