package cn.yskcoder.fire.model;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义Authentication对象
 *
 * @author:       yskcoder
 * @createDate:   2019/12/26 11:26
 * @version:      1.0
*/
public class ShiroUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;                  //主键ID
    private String account;           //账号
    private String name;              //姓名
    private List<Long> orgs;         //部门集合
    private List<Long> roles;         //角色集合
    private List<String> roleNames;  //角色名称集合


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getOrgs() {
        return orgs;
    }

    public void setOrgs(List<Long> orgs) {
        this.orgs = orgs;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }
}
