package dominio;
import java.io.Serializable;

public class Ordenador implements Serializable{
    private String marca;
    private String cpu;
    private String gpu;
    private int ram;

    public Ordenador(String marca, String cpu, String gpu, int ram){
        this.marca = this.marca;
        this.cpu = this.cpu;
        this.gpu = this.gpu;
        this.ram = this.ram;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca_) {
        marca = marca_;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu_) {
        cpu = cpu_;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu_) {
        gpu = gpu_;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram_) {
        ram = ram_;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", CPU: " + cpu + ", GPU: " + gpu + ", RAM: " + ram + "GB");
    }
    public String toString() {
        return "Ordenador(marca=" + marca + ", cpu=" + cpu + ", gpu=" + gpu + ", ram=" + ram + "GB)";
    }
}