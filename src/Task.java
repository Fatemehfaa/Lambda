public class Task {
    private Long id;
    private String name;
    private Boolean check1;
    private Boolean check2;
    private Boolean check3;
    private Boolean check4;
    private Boolean check5;
    private Boolean check6;
    private Boolean check7;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCheck1() {
        return check1;
    }

    public void setCheck1(Boolean check1) {
        this.check1 = check1;
    }

    public Boolean getCheck2() {
        return check2;
    }

    public void setCheck2(Boolean check2) {
        this.check2 = check2;
    }

    public Boolean getCheck3() {
        return check3;
    }

    public void setCheck3(Boolean check3) {
        this.check3 = check3;
    }

    public Boolean getCheck4() {
        return check4;
    }

    public void setCheck4(Boolean check4) {
        this.check4 = check4;
    }

    public Boolean getCheck5() {
        return check5;
    }

    public void setCheck5(Boolean check5) {
        this.check5 = check5;
    }

    public Boolean getCheck6() {
        return check6;
    }

    public void setCheck6(Boolean check6) {
        this.check6 = check6;
    }

    public Boolean getCheck7() {
        return check7;
    }

    public void setCheck7(Boolean check7) {
        this.check7 = check7;
    }

    public Task() {
    }

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
        check1 = false;
        check2 = false;
        check3 = false;
        check4 = false;
        check5 = false;
        check6 = false;
        check7 = false;
    }


}
