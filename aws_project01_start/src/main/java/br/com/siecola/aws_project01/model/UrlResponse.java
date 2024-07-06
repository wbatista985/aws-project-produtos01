package br.com.siecola.aws_project01.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlResponse {

    private String url;
    private long expirationTime;
}
