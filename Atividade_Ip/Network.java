package Atividade_Ip;

public class Network {
    private String ip1;
    private String ip2;
    private int numMask;
    public Network(String ip1, String ip2, int numMask) {
        this.setIp1(ip1);
        this.setIp2(ip2);
        this.setMask(numMask);
    }
    public void setIp1(String ip1) {
        this.ip1 = ip1;
    }
    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }
    public void setMask(int numMask) {
        this.numMask = numMask;
    }
    public String getIp1() {
        return this.ip1;
    }
    public String getIp2() {
        return this.ip2;
    }
    public int getMask() {
        return this.numMask;
    }
    public String ToString() {
        return String.format("Endereço IP 1 = %s\nEndereço IP 2 = %s\nMáscara = %d", this.getIp1(), this.getIp2(), this.getMask());
    }
    public boolean SameNetwork() {
        String ip1 = this.ip1;
        String ip2 = this.ip2;
        int numMask = this.numMask;
        String mask = "";
        String[] partesIp1 = ip1.split("\\.");
        String[] partesIp2 = ip2.split("\\.");
        String ip1Final = "";
        String ip2Final = "";
        String andIp1Mask = "";
        String andIp2Mask = "";
        
        for (int i = 1; i < 33; i++) {
            if (i <= numMask) { mask += "1"; }
            else { mask += "0"; }
        }
        for (int i = 0; i < 4; i++) {
            int parteIp1 = Integer.parseInt(partesIp1[i]);
            String[] ip1Bin = {"", "", "", "", "", "", "", ""};
            int parteIp2 = Integer.parseInt(partesIp2[i]);
            String[] ip2Bin = {"", "", "", "", "", "", "", ""};
            for (int j = 0; j < 8; j++) {
                ip1Bin[j] = Integer.toString(parteIp1 % 2);
                parteIp1 = parteIp1 / 2;
                ip2Bin[j] = Integer.toString(parteIp2 % 2);
                parteIp2 = parteIp2 / 2;
            }
            for (int k = 7; k >= 0; k--) {
                ip1Final += ip1Bin[k];
                ip2Final += ip2Bin[k];
            }
        }
        for (int i = 0; i < 32; i++) {
            andIp1Mask += Integer.toString(Integer.parseInt(Character.toString(ip1Final.charAt(i))) & Integer.parseInt(Character.toString(mask.charAt(i))));
            andIp2Mask += Integer.toString(Integer.parseInt(Character.toString(ip2Final.charAt(i))) & Integer.parseInt(Character.toString(mask.charAt(i))));
        }
        if (andIp1Mask.equals(andIp2Mask)) {
            return true;
        } else {
            return false;
        }
    }
}
