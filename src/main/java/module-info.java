module org.example.orm_course_work {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires static lombok;
    requires org.hibernate.orm.core;
    requires com.jfoenix;


    opens org.example to javafx.fxml;
    exports org.example;
}