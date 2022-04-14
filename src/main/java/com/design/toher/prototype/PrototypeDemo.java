package com.design.toher.prototype;

/**
 * @Author 李怀明
 * @Date 2022/4/12 3:09 下午
 * @Version 1.0
 * 原型模式的应用场景
 */
public class PrototypeDemo {
    public void saveParam(ParamVo vo){
        //为了证明ParamVo意义，验证确认密码
        if(!vo.getConfirmPassword().equals(vo.getPassword())){
            System.out.println("密码和确认密码不一致");
            return;
        }
        Param param = new Param();
        param.setName(vo.getName());
        param.setPassword(vo.getPassword());
        //TODO 进行Param 保存

    }

    class ParamVo{
        private String name;
        private String password;
        private String confirmPassword;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }
    }

    class Param{
        private String name;
        private String password;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }
}
