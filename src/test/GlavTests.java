package test;
import org.junit.jupiter.api.Test;

import static main.java.Main.WithCollectionData;
import static org.junit.jupiter.api.Assertions.*;
import main.java.SimpleData;
import main.java.WithCollectionData;
import main.java.NotCopy;
import java.lang.reflect.Field;
import java.util.ArrayList;

import java.lang.reflect.Field;

public class GlavTests {

    @org.junit.jupiter.api.Test
    void printFieldsNamesTest() {
        SimpleData simpleData = new SimpleData();
        Field[] fields = simpleData.getClass().getDeclaredFields();
        int i = 0;

        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
        fields = simpleData.getClass().getSuperclass().getDeclaredFields();
        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
    }
    @Test
    void printFieldsNamesTest2() {
        WithCollectionData withCollectionData = new WithCollectionData();
        Field[] fields = withCollectionData.getClass().getDeclaredFields();
        int i = 0;


        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
        i = 0;

        fields = withCollectionData.getClass().getSuperclass().getDeclaredFields();

        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
    }
}