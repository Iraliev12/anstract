public  class  Sheep extends Farm {
    private  int weight;
    private  int age;
    private  String colour;
    private String gender;
    private String NickName;

    public Sheep(String address, int cows, int horses, int sheep, String ownerName,
                 int weight, int age, String colour, String gender, String nickName) {
        super(address, cows, horses, sheep, ownerName);
        this.weight = weight;
        this.age = age;
        this.colour = colour;
        this.gender = gender;
        NickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }
}
