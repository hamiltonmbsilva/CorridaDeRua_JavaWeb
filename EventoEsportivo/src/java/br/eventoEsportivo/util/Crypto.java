/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Hamilton
 */
public class Crypto {
    
    public static String md5(String msg){
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(msg.getBytes(), 0, msg.length());
            return new BigInteger(1,m.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            return "";
        }
    }
}
