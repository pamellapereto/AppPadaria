package model;

public class Pedido {
    private int idPedido;
    private String dataPedido;
    private String status;
    private int idCliente;

    public Pedido(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }
    public String getDataPedido() { return dataPedido; }
    public void setDataPedido(String dataPedido) { this.dataPedido = dataPedido; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
}
