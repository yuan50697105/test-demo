package com.example.demo.spring.cloud.dubbo.rds.user.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@FluentMybatis
@Entity
public class SystemUser extends RichEntity {
    @Id
    @TableId
    @com.baomidou.mybatisplus.annotation.TableId(type = IdType.INPUT)
    @NotNull(groups = {Update.class, UpdateState.class})
    private Long id;
    @NotBlank(groups = {Add.class, Update.class})
    private String username;
    @NotBlank(groups = {Add.class, Password.class})
    private String password;
    @NotNull(groups = UpdateState.class)
    private Integer state;

    public interface Add {
    }

    public interface Update {
    }

    public interface Password {
    }

    public interface UpdateState {

    }

}
