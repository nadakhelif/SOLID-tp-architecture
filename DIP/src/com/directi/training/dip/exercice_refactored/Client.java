package com.directi.training.dip.exercice_refactored;

public class Client {
    private Encoder fileEncoder;
    private NetworkEncoder networkEncoder;

    public Client(Encoder fileEncoder, NetworkEncoder networkEncoder) {
        this.fileEncoder = fileEncoder;
        this.networkEncoder = networkEncoder;
    }

    public void encodeData(String data) {
        String fileEncodedData = this.fileEncoder.encode(data);
        System.out.println("File Encoded Data: " + fileEncodedData);
        String networkEncodedData = this.networkEncoder.encode(data);
        System.out.println("Network Encoded Data: " + networkEncodedData);
    }
}