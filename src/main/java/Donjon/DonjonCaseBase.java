package Donjon;

public abstract class DonjonCaseBase implements DonjonCase{
    protected boolean monstre;
    protected boolean piege;

    public DonjonCaseBase(){
        this.monstre = false;
        this.piege = false;
    }

    @Override
    public void typeCase(){
        System.out.println("Dans cette case, il y a : ");
        if(monstre){
            System.out.println("Un monstre !");
        } else if(piege){
            System.out.println("Un piège !");
        } else {
            System.out.println("rien");
        }
    }
}
