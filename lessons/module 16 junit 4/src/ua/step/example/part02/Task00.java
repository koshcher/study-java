package ua.step.example.part02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ua.step.example.part00.practica.Task01;
import ua.step.example.part00.practica.Task02;

/**
 * @RunWith позволяет объеденить запуск нескольких тестовых классов в один тест
 */
// список классов которые запустятся вместе

@RunWith(Suite.class)
@Suite.SuiteClasses({ ua.step.example.part00.practica.Task00.class, Task01.class , Task02.class})
public class Task00
{

}