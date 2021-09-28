class Amity {
    Amity() {
        System.out.println("Amity...non para cons...base");
    }

    Amity(int a) {
        System.out.println("Amity...Para cons...base");
    }

    Amity(int x, int y) {
        System.out.println("Amity Double para cons...base");
    }
}

class GLA extends Amity {
    GLA() {
        System.out.println("GLA...non para cons...derived");
    }

    GLA(int z) {
        super(z, z);
        System.out.println("GLA...para cons...derived");
    }

    public static void main(String[] args) {
        GLA obj = new GLA(10);
        
    
    }
}