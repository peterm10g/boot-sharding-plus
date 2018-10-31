package com.lsh.sharding.demo.dto;

import lombok.*;

/**
 * Project Name: sharding-demo
 * Created by peter on 18/10/31.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfigDTO {

    private Integer id;
    private String name;
    private String config;
}
