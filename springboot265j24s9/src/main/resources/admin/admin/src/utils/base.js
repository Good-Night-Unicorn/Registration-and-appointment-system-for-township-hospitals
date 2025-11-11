const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot265j24s9/",
            name: "springboot265j24s9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot265j24s9/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "乡镇医院挂号预约系统"
        } 
    }
}
export default base
