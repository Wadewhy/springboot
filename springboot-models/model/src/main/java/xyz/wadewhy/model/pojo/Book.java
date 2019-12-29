package xyz.wadewhy.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @PACKAGE_NAME: xyz.wadewhy.model.pojo
 * @NAME: Book
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer id;
    private String author;
    private String name;
    private Float price;
    private Date create_time;
    private String description;
}
