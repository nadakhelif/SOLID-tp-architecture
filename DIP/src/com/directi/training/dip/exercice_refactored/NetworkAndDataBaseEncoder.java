package com.directi.training.dip.exercice_refactored;

import java.util.Base64;

public class NetworkAndDataBaseEncoder implements NetworkEncoder {
    private IDataBase database;

  public NetworkAndDataBaseEncoder(IDataBase database) {
    this.database = database;
  }

  @Override
  public String encode(String data) {
    String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
    database.write(encodedData);
    return encodedData;
  }
    
}
