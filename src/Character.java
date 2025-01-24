public class Character {
    private String Name;
    private Integer XPosition;
    private Integer YPosition;
    public Character(String Name, Integer XPosition, Integer YPosition){
        this.Name = Name;
        this.XPosition = XPosition;
        this.YPosition = YPosition;
    }

    public Integer GetXPosition() {
        return XPosition;
    }

    public Integer GetYPosition() {
        return YPosition;
    }

    public void SetXPosition(Integer XPosition) {
        this.XPosition = GetXPosition() + XPosition;
        if (GetXPosition() > 10000){
            this.XPosition = 10000;
        }
        if (GetXPosition() < 0){
            this.XPosition = 0;
        }
    }

    public void SetYPosition(Integer YPosition) {
        this.YPosition = GetYPosition() + YPosition;
        if (GetYPosition() > 10000){
            this.YPosition = 10000;
        }
        if (GetYPosition() < 0){
            this.YPosition = 0;
        }
    }

    public void Move(String value){
        value = value.toLowerCase();
        switch (value){
            case ("up") : SetYPosition(+10);
            break;
            case ("down") : SetYPosition(-10);
            break;
            case ("left") : SetXPosition(-10);
            break;
            case ("right") : SetXPosition(+10);
            break;
        }
    }
}
