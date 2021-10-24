package dao;

import org.junit.jupiter.api.Test;
import pojo.Teacher;

import static org.junit.jupiter.api.Assertions.*;

class TeacherDaoTest {


    @Test
    void addTeacher() {
        Teacher teacher = new Teacher("GV1006", "Pham Thi Anh Thu", "Thu", "0000", "");
        assertTrue(TeacherDao.addTeacher(teacher));
    }

    @Test
    void addTeacherWithoutId(){
        Teacher teacher = new Teacher("", "Nguyen Van A", "VanA", "1111", "");
        assertFalse(TeacherDao.addTeacher(teacher));
    }

    @Test
    void addTeacherWithSameId(){
        Teacher teacher = new Teacher("GV1005", "Nguyen Van C", "VanC", "9999", "");
        assertFalse(TeacherDao.addTeacher(teacher));
    }


}