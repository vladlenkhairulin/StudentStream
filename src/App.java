import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;
/*
* Название проекта: Список студентов
* Описание: приложение реализует список потоков и групп студентов.
* В приложении встроены функции сортировки студентов по возрасту или айди.
* Добавлена сортировка групп в потоке по количеству студентов, затем по номеру группы.
* Автор: Хайрулин Владлен
* Дата создания: 17.03.2024.
* Версия проекта: 2.0..
* */
public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Паша",  25);
        Student s8 = new Student("Оля",  20);
        Student s9 = new Student("Наташа",  25);
        Student s10 = new Student("Оля",  28);
        Student s11 = new Student("Галя",  24);
        Student s12= new Student("Миша",  22);
        Student s13 = new Student("Станислав",  26);
        Student s14 = new Student("Евгения",  26);


        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s11);
        listStud3.add(s12);
        listStud3.add(s13);
        listStud3.add(s14);



        StudentGroup group5830 = new StudentGroup(listStud, 5830);
        StudentGroup group5831 = new StudentGroup(listStud2, 5831);
        StudentGroup group5832 = new StudentGroup(listStud3, 5832);
        //System.out.println(group5830);

        //for(Student std : group5830)
        //{
        //    System.out.println(std);
        //}

        System.out.println("=========================================================");

        Collections.sort(group5830.getGroup());

        // создаем список, добавляем в него группы студентов.
        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group5830);
        listGroup.add(group5831);
        listGroup.add(group5832);
        // создаем поток студентов из готового списка групп и номера потока.
        StudentStream stream1 = new StudentStream(listGroup, 1);
        // сортируем поток студентов.
        Collections.sort(stream1.getStream());
        // выводим на консоль
        for (StudentGroup grp : stream1)
        {
            System.out.println(grp);
        }
        System.out.println("=========================================================");
        System.out.println(stream1);


    }
}