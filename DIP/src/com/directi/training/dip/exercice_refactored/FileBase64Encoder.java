package com.directi.training.dip.exercice_refactored;

import java.util.Base64;

public class FileBase64Encoder implements FileEncoder {
    @Override
    public String encode(String data) {
      return Base64.getEncoder().encodeToString(data.getBytes());
    }
  }