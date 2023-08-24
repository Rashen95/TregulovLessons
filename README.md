# TregulovLessons

## Lesson 1 (HomeWork)

```
1. Вывести на дисплей рубаи (четверостишье), соблюдая все отступы в
следующем виде:
                 РУБАИ
Много лет размышлял я над жизнью земной.
Непонятного нет для меня под луной.
Мне известно, что мне ничего не известно!
Вот последняя правда, открытая мной.
                                 О. Хайям
```

## Lesson 2 (HomeWork)

```
1. Создать по 4 переменные всех целочисленных типов данных в следующем виде:
   • Все 4 переменные типа byte должны равняться 12 и быть записанны в разных
   системах счисления;
   • Все 4 переменные типа short должны равняться -1300 и быть записанны в разных
   системах счисления;
   • Все 4 переменные типа int должны равняться 0 и быть записанны в разных
   системах счисления;
   • Все 4 переменные типа long должны равняться 123456789 и быть записанны в
   разных системах счисления;
   И вывести их на экран.
2. Создать по 2 переменные типов данных float, double и boolean. И вывести их на
   экран.
3. Создать n-ное количество переменных типа данных char всеми возможными
   способами. И вывести их на экран.
```

## Lesson 3 (HomeWork)

```
1. Вычислите следующую часть кода:
int i1=5;
int i2=11;
double d1 = 5.5;
double d2 = 1.3;
long l = 20l;
double result=0;
result = i2 / d1 + d2 % i1 - l;
2. Чему равны выражения:
• a-- - --a + ++a + a++ + a; где а=5
• ++b - b++ + ++b - --b; где b=8
```

## Lesson 4 (HomeWork)

```
1. Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе
   следующие атрибуты: номер студенческого билета, имя, фамилию, год
   обучения, средняя оценка по математике, средняя оценка по экономике,
   средняя оценка по иностранному языку. 2-ой класс назовите StudentTest.
   В нём Вы должны будете создать 3 разных объекта класса Student,
   вывести на экран в читабельном виде среднюю арифметическую оценку
   каждого студента (учитывая все 3 предмета).
   P.S.: Старайтесь писать код, понятный не только для Вас, а для всех.
```

## Lesson 5 (HomeWork)

```
1. В класс BankAccount добавьте 2 метода. Первый метод называется
popolnenieScheta и увеличивает баланс на сумму, которая указана в
параметре этого метода. Второй метод называется snyatieSoScheta и
уменьшает баланс на сумму, которая указана в параметре этого метода.
2. Измените класс StudentTest так, чтобы среднюю арифметическую оценку
студента выводил на экран метод. Т. е. создайте 1 метод, параметр
которого – это объект класса Student, а в теле метода будет вычисляться
средняя арифметическая оценка и выводиться на экран.
3. Создайте класс Employee с атрибутами id, surname, age, salary,
department, которые должны задаваться в конструкторе. В данном классе
также создайте метод увеличения зар платы вдвое. Создайте второй
класс EmployeeTest, в котором создайте 2 объекта класса Employee.
Увеличьте зарплату каждому работнику вдвое с помощью метода и
выведите на экран значение новой зар платы.
```

## Lesson 6 (HomeWork)

```
1. Создайте класс, в котором будут 5 overloaded методов,
которые вычисляют сумму нуля, одного, двух, трёх и четырёх
целых чисел соответственно, передают эту сумму в output и
выводят её на экран. В случае, когда слагаемые отсутствуют
(т.е. когда параметров нет) сумма пусть равняется 0.
2. Измените класс Student так, чтобы он имел 3 конструктора. 1-
ый принимает все параметры. 2-ой – только id, name,
surname, course. 3-ий не принимает значений. Создайте в
классе StudentTest 3 объекта с помощью разных
констукторов.
```

## Lesson 7 (HomeWork)

```
1. Пересоздайте класс Employee таким образом, чтобы
переменная salary была недоступна вне класса, переменная
surname была доступна отовсюду, а переменная id только
внутри пакета. Также создайте 3 public метода, которые будут
показывать на дисплее значения этих переменных. Создайте
для данного класса 3 разных конструктора с public, default и
private access modifier-ами. В констукторах присваивайте
переменным класса значения из параметров. Создайте
новые классы в том же и в другом пакете. Попытайтесь в них
создать объекты класса Employee и вывести на экран
значения переменных данного объекта с помощью метода
println и методов самого класса.
```

## Lesson 8 (HomeWork)

```
1. В первом классе создайте 2 static метода. 1-ый пусть умножает 3 числа из
параметра метода и возвращает их произведение; 2-ой – делит первое
число из параметра на второе и ничего не возвращает, лишь выводит на
дисплей в читабельном виде целое частное и остаток. Во втором классе
по два раза используйте данные методы.
2. В первом классе создайте static final переменную Пи = 3,14. Используйте
данную константу в non-static методе, который принимает в параметре
значение радиуса и вычисляет площадь круга по формуле: Площадь = Пи
* радиус * радиус. Также используйте данную константу в static методе,
который принимает в параметре значение радиуса и вычисляет длину
окружности по формуле: Площадь = 2 * Пи * радиус. Создайте ещё один
non-static метод, который принимает в параметре значение радиуса и
выводит на экран информацию о радиусе, площади круга и длине
окружности. Используйте все 3 метода во 2-м классе.
```

## Lesson 9 (HomeWork)

```
1. Напишите программу, в которой будет созданно 8 объектов, но к
последней строке метода main останется всего 2.
2. Вычислите устно output-ы данных программ, а затем проверьте в
NetBeans:
2.1
class Test1{
int a=1;
static int a=2;
void abc(int a){
System.out.println(a);
System.out.println(this.a);
}
public static void
main(String [] args){
Test1 t = new Test1();
t.abc(3);
}
}
2.2
class Test2{
int a=1;
static int b=2;
static void abc(final int a){
System.out.println(a);
System.out.println(Test2.b);
}
public static void
main(String [] args){
abc(5);
}
}
2.3
class Test3{
int a=1;
static int b=2;
void abc(int a){
System.out.println(b);
System.out.println(a);
System.out.println(this.a);
System.out.println(Test3.b);
}
public static void
main(String [] args){
Test3 t = new Test3();
t.abc(4);
}
}
```

## Lesson 10 (HomeWork)

```
1. Создайте пакет p1, в нём класс А. В пакете p1 создайте подпакет p2, в нём
класс B со static элементами. В подпакете p2 создайте подпакет p3, в нём
класс C. Создайте новый пакет p4, в нём класс D. В пакете p4 создайте
подпакет p5, в нём класс E. Внутри класса D напишите код, который
будет задействовать любые элементы классов A, C, E, а также static
элементы класса B. Используя выражения import и import static,
работайте с не полными именами классов.
```

## Lesson 11 (HomeWork)

```
1. Создайте класс Car с тремя переменными: цвет, мотор и количество
дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
1-ый изменяет количество дверей объекта класса Car на количество,
прописанное в параметре метода. 2-ой принимает в параметры 2 объекта
класса Car и меняет их цвета местами. Примените оба метода в main и
выведите на экран атрибуты всех объектов.
```

## Lesson 12 (HomeWork)

```
1. В классе StudentTest написать 2 метода, которые принимают 2 input
параметра – 2 объекта класса Student из Lesson11. Первый метод
сравнивает 2-х студентов, используя 1 if statement и логические
операторы внутри него и выводит на экран информацию о том, равны ли
студенты. Второй метод использует nested if statement, сравнивает все
атрибуты студента по отдельности, выводит на экран информацию о том,
равны ли студенты, а если не равны, то в чём именно было обнаруженно
первое неравенство.
```

## Lesson 13 (HomeWork)

```
1. В классе Month создайте метод, у которого 1 параметр типа данных int.
Этот параметр будет указывать порядковый номер месяца. Используя
функционал switch, выведите на экран количество дней этого месяца
(для 2015 года). Проверьте работу данного метода в main.
```

## Lesson 14 (HomeWork)

```
1. Создать класс. В классе создать статичный метод, который будет
выводить на экран время в формате «час:минута:секунда» в интервале от
0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
нужно закончить. Если же (секунда умноженная на час) больше минуты,
то пора переходить на другую минуту. Продемонстрировать данный
метод в действии.
```

## Lesson 15 (HomeWork)

```
1. Переписать домашнее задание из Урока 14 так, чтобы outer и
inner циклы представляли собой while loop, а middle цикл
представлял собой do while loop.
```

## Lesson 16 (HomeWork)

```
1. Создайте класс, в котором создайте метод email. Данный
метод должен принимать в инпут 1 String параметр. Данный
параметр должен содержать в себе email-ы в следующем
виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; , т.е.
После каждого e-mail должен стоять знак препинания “;”. Ваш
метод должен выводить на экран информацию о том, какой
почтой пользуются, исходя из параметра, т.е. оутпут должен
быть следующего вида:
yahoo
mail
gmail
Продемонстрируйте данный метод.
```

## Lesson 17 (HomeWork)

```
1. Создайте класс, в котором создайте метод ravenstvo. Инпут
параметрами данного метода будут 2 объекта класса
StringBuilder. Метод должен иметь boolean return type,
возвращать true, если значения объектов совпадают, false –
если не совпадают.
Продемонстрируйте данный метод.
```

## Lesson 18 (HomeWork)

```
1. Создайте класс, в котором создайте метод sortirovka. Инпут
параметром данного метода будет одномерный массив типа
int. Метод должен возвращать уже отсортированный по
возрастанию массив .
Продемонстрируйте данный метод.
2. Создайте класс, в котором создайте метод showArray. Инпут
параметром данного метода будет двумерный массив типа
String. Метод должен выводить на экран данный массив в
следующем виде:
{ {элемент00, элемент01}, {элемент10}, {элемент10, элемент11} }
Содержимое, естественно, будет зависеть от Вашего массива.
Продемонстрируйте данный метод.
```

## Lesson 19 (HomeWork)

```
1. Создайте метод abc, инпут параметр которого – N-ое
количество массивов типа String. В методе создайте новый
массив, который будет состоять из элементов массивов-
параметров и будет оутпутом данного метода. В методе main
вызовите метод abc и его элементам, которые равны
значениям command line параметров, присвойте значение
null. Выведите элементы обновлённого массива на экран.
Везде, где возможно, используйте foreach loop.
Запустите приложение с командной строки.
```

## Lesson 20 (HomeWork)

```
1. Создайте класс, в котором создайте метод abc. Инпут
параметром данного метода будет N-ое количество
параметров типа String. Метод должен возвращать уже
отсортированный объект ArrayList из неповторяющихся
объектов типа String, взятых из параметра метода и выводить
данный объект на экран.
Продемонстрируйте данный метод.
```

## Lesson 22 (HomeWork)

```
1. Создайте класс Student со следующими переменными: name (используйте
StringBuilder), course, grade. Примените инкапсуляцию к данному классу.
Длина имени объектов не должна быть менее 3-х символов, оценки должны
быть числами в интервале от 1 до 10, курс должен быть числом от 1 до 4
включительно. Создайте метод showInfo, который будет выводить всю
информацию о студенте, не используя переменные класса напрямую.
Создайте класс TestStudent, в котором создайте объект класса Student,
придайте его переменным значения. Произведите вызов метода showInfo.
2. Создайте класс Animal. При вызове его конструктора пусть на экран выводится "I
am animal". В классе пусть будут переменная eyes, характеризующая количество глаз;
методы eat (выводящий на экран "Animal eats") и drink (выводящий на экран "Animal
drinks").
Создайте класс Pet, который является child классом класса Animal. При вызове его
конструктора пусть на экран выводится "I am pet" и переменной eyes придаётся
значение 2. В классе пусть будут переменные name; tail, характеризующая
количество хвостов и равная 1; paw, характеризующая количество лап и равная 4;
методы run (выводящий на экран "Pet runs") и jump (выводящий на экран "Pet
jumps").
Создайте класс Dog, который является child классом класса Pet. При вызове его
конструктора с параметром, который будет передавать имя, пусть на экран
выводится "I am dog and my name is: " + имя питомца. В класс добавьте метод play
(выводящий на экран "Dog plays").
Создайте класс Cat, который является child классом класса Pet. При вызове его
конструктора с параметром, который будет передавать имя, пусть на экран
выводится "I am cat and my name is: " + имя питомца. В класс добавьте метод sleep
(выводящий на экран "Cat sleeps").
Создайте класс Test, в методе main которого выведите на экран количество лап
объекта класса Dog и вызовите метод sleep объекта класса Cat.
```

## Lesson 23 (HomeWork)

```
Test 1
Каков будет результат компиляции и запуска класса Y?
package p1;
public class X{
X() { }
public void abc()
{ System.out.println(‘X’);
}
}
-------------------------------------------------------------------------------------------------
package p2;
import p1.*;
public class Y extends X{
Y()
{ }
public void abc()
{ System.out.println(‘Y’); }
public static void main(String[] args){
Y y = new Y();
y.abc();
}
}

Test 2
Каков будет результат компиляции и запуска класса Y?
package p1;
public class X{
protected void abc() { System.out.println('X'); }
}
------------------------------------------------------------------------------------
package p2;
import p1.*;
public class Y extends X {
public void abc()
{ System.out.println(‘Y'); }
public void def()
{ Y y = new Y(); y.abc(); }
public void ghi()
{ X x = new Y(); x.abc(); }
public static void main(String[] args)
{ Y a = new Y();
a.abc(); a.def(); a.ghi();
}
}

Test 3
Каков будет результат компиляции и запуска классов X и Y?
public class X{
public X() { System.out.println(“X”); }
public X(int i) { System.out.println(“X” + i); }
private boolean abc() { return false; }
public static void main(String[] args) {
X x= new Y(18);
System.out.println( x.abc() );
}
}
class Y extends X{
public Y(int i) { System.out.println(“Y”); }
public boolean abc () { return true; }
}

Test 4
Каков будет результат компиляции и запуска класса Test?
class X {}
class Y extends X {}
public class Test {
public static void abc(X x, Y y)
{
System.out.println(“privet");
}
public static void abc(Y y, X x)
{
System.out.println(“poka");
}
public static void main(String[] args) {
Y a = new Y ();
abc(a, a);
}
}

Test 5
Каков будет результат компиляции и запуска класса Test?
class X{
String s1 = “privet";
}
class Y extends X {
boolean bool = false;
}
class Test {
public static void main(String args[]) {
X x = new Y ();
System.out.println(x.s1 + “ ” + x.bool);
}
}
```

## Lesson 24 (HomeWork)

```
Создайте абстрактный класс Animal, его конструктор пусть имеет параметр, значение которого
назначается переменной String name. В классе Animal создайте абстрактные методы eat и sleep.
Создайте абстрактный класс Fish, который является дочерним классом класса Animal, его конструктор
пусть имеет параметр, значение которого назначается переменным name данного и родительского
класса. В классе Fish перезапишите метод sleep так, чтобы он выводил на экран "Vsegda interesno
nablyudat, kak spyat ribi". Также здесь создайте абстрактный метод swim.
Создайте абстрактный класс Bird, который является дочерним классом класса Animal, его конструктор
пусть имеет параметр, значение которого назначается переменным name данного и родительского
класса. Также здесь создайте абстрактный метод fly.
Создайте абстрактный класс Mammal, который является дочерним классом класса Animal, его
конструктор пусть имеет параметр, значение которого назначается переменным name данного и
родительского класса. Также здесь создайте абстрактный метод run.
Создайте интерфейс Speakable, в котором пусть будет дефолтный метод speak, который выводит на
экран "Somebody speaks" . Пусть класс Mammal имплементирует этот интерфейс. Также пусть класс Bird
имплементирует этот интерфейс и перезаписывает его метод так, чтоб он выводил на экран имя + "
sings" .
Создайте класс Mechenosec, который является дочерним классом класса Fish, его конструктор пусть
имеет параметр, значение которого назначается переменным name данного и родительского класса. В
классе Mechenosec перезапишите метод swim так, чтобы он выводил на экран "Mechenosec krasivaya
riba, kotoraya bistro plavaet!". Также перезапишите метод eat так, чтобы он выводил на экран
"Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!".
Создайте класс Pingvin, который является дочерним классом класса Bird, его конструктор пусть имеет
параметр, значение которого назначается переменным name данного и родительского класса. В классе
Pingvin перезапишите метод eat так, чтобы он выводил на экран "Pingvin lyubit est ribu!". Также
перезапишите метод sleep так, чтобы он выводил на экран "Pingvini spyat prijavshis drug k drugu!". Также
перезапишите метод fly так, чтобы он выводил на экран "Pingvini ne umeyut letat!". Также перезапишите
метод speak так, чтобы он выводил на экран "Pingvini ne umeyut pet kak solovyi".
Создайте класс Lev, который является дочерним классом класса Mammal, его конструктор пусть имеет
параметр, значение которого назначается переменным name данного и родительского класса. В классе
Lev перезапишите метод eat так, чтобы он выводил на экран "Lev, kak lyuboy xishnik, lyubit myaso!". Также
перезапишите метод sleep так, чтобы он выводил на экран "Bolshuyu chast dnya lev spit!". Также
перезапишите метод run так, чтобы он выводил на экран "Lev-eto ne samaya bistraya koshka!".
В классе Lesson24 создайте main метод, в котором:
1. Создайте объект класса Mechenosec, на который ссылается переменная типа Mechenosec, выведите
переменную name данного объекта и вызовите все методы, которые сможете вызвать с помощью
данной переменной;
2. Создайте объект класса Pingvin, на который ссылается переменная типа Speakable, вызовите все
методы, которые сможете вызвать с помощью данной переменной;
3. Создайте объект класса Lev, на который ссылается переменная типа Animal, выведите переменную
name данного объекта и вызовите все методы, которые сможете вызвать с помощью данной
переменной;
4. Создайте ещё один объект класса Lev, на который ссылается переменная типа Mammal, выведите
переменную name данного объекта и вызовите все методы, которые сможете вызвать с помощью
данной переменной.
```

## Lesson 25 (HomeWork)

```
Переименуйте класс Lesson24 из последнего домашнего задания в
Lesson25 и измените его метод main следующим образом. Создайте в
нём 2 массива типа Speakable и типа Animal, которые будут содержать все
возможные ссылочные переменные, ссылающиеся на все возможные
объекты. Используя if и instanceof проверяйте на какой объект ссылается
переменная и выводите на экран соответствующие переменные данного
объекта и вызывайте его методы.
```

## Lesson 27 (HomeWork)

```
Создайте 2 исключения. 1-ый пусть является дочерним классом класса RuntimeException и
называется NeMyasoException; в нём создайте конструктор, который принимает 1 String
параметр и передаёт его конструктору super класса. 2-ой пусть является дочерним классом
класса Exception и называется NeVodaException; в нём создайте конструктор, который
принимает 1 String параметр и передаёт его конструктору super класса.
Создайте класс Tiger. Первый метод класса - метод eat будет иметь return type void и
принимать 1 String параметр. Если данный параметр не равен String-у “myaso”, то пусть
метод выбрасывает объект NeMyasoException с параметром "Tigr ne est " + параметр
метода. Если данный параметр равен String-у “myaso”, то пусть на экран выводится “Tigr est
myaso”. Второй метод класса - метод drink будет иметь return type void и принимать 1 String
параметр. Если данный параметр не равен String-у “voda”, то пусть метод выбрасывает
объект NeVodaException с параметром "Tigr ne pyet " + параметр метода. Если данный
параметр равен String-у “voda”, то пусть на экран выводится “Tigr pyet vodu”.
В классе Lesson27 внутри метода main создайте объект класса Tiger. Вызовите метод eat с
параметром “myaso”. Затем в блоке try вызовите метод drink с параметром voda. В данном
блоке try создайте ещё один блок try, где вызовите метод drink с параметром pivo. Во
внешнем блоке try пусть также размещаются блок catch, который ловит исключения типа
Exception и в своем теле выводит на экран мессаж данного исключения; блок catch, который
ловит исключения типа NeVodaException и в своем теле выводит на экран мессаж данного
исключения; блок finally, который в своем теле выводит на экран "Eto inner finally block“. К
внешнему try блоку пусть относятся блок catch, который ловит исключения типа Exception и
в своем теле выводит на экран мессаж данного исключения; блок catch, который ловит
исключения типа RuntimeException и в своем теле выводит на экран мессаж данного
исключения.
```

## Lesson 28 (HomeWork)

```
Создайте класс. Внутри класса создайте 2 шаблона с помощью класса
DateTimeFormatter. 1-ый шаблон подгоните под вид «2016, января-01 !! 09:00», 2-
ой - под вид «09:00, 03/фев/16». Создайте метод smena, который принимает в
параметры объекты следующих классов: 2 объекта LocalDateTime, 1 объект
Period, 1 объект Duration. До тех пор, пока 1-ый объект LocalDateTime меньше
(раньше) 2-го проделывайте все следующие действия (даже если во время
данных действий 1-ый объект LocalDateTime уже не меньше 2-го) раз за разом:
1. Выводите на экран «Работаем с: » + дата и время 1-го объекта с
использованием 1-го шаблона;
2. Увеличивайте данный (1-ый) объект на период и выводите на экран « До: » +
дата и время изменённого 1-го объекта с использованием 1-го шаблона;
3. Выводите на экран «Отдыхаем с: » + дата и время изменённого 1-го объекта с
использованием 2-го шаблона;
4. Увеличивайте данный (1-ый) объект на продолжительность и выводите на
экран « До: » + дата и время изменённого 1-го объекта с использованием 2-го
шаблона.
Старайтесь, чтобы вывод был читабельным.
В методе main создайте все необходимые объекты и запустите с их помощью
метод smena.
```