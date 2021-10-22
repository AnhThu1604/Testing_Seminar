package dao;

import org.junit.jupiter.api.Test;
import pojo.Teacher;

import static org.junit.jupiter.api.Assertions.*;

class TeacherDaoTest {

    @Test
    void getTeacherList() {
    }

    @Test
    void getTeacher() {
    }

    @Test
    void addTeacher() {
        Teacher teacher = new Teacher("GV10120", "Pham Thi Anh Thu", "Thu", "0000", "");
        assertTrue(TeacherDao.addTeacher(teacher));
    }

    @Test
    void addTeacherWithoutId(){
        Teacher teacher = new Teacher(null, "Nguyen Van A", "VanA", "1111", "");
        assertTrue(TeacherDao.addTeacher(teacher));
    }

    @Test
    void addTeacherWithSameId(){
        Teacher teacher = new Teacher("GV10120", "Nguyen Van C", "VanC", "9999", "");
        assertFalse(TeacherDao.addTeacher(teacher));
    }

    @Test
    void deleteTeacher() {
    }

    @Test
    void updateTeacher() {
    }

    @Test
    void fullTextSearch() {
    }
}