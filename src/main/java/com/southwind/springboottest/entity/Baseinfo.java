package com.southwind.springboottest.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "baseinfo")
public class Baseinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*插入数据,一定要把主键设置为自增*/
    private BigInteger QQID;
    /*这里@Column对应数据库中的名称数据库不区分大小写
    * 驼峰命名发表示的是如:
    *数据库中NickName 而java中就要用小写如果用大写就表示向前加下划线(查找数据库中的nick_name所以是错误的)
    * 这里就是nickname */
    @Column(name = "nickname")
    private String NickName;
    @Column(name = "Sex")
    private int Sex;
}
