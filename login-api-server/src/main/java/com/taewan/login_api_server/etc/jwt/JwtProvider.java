package com.taewan.login_api_server.etc.jwt;

import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtProvider implements TokenProvider {

    private final Key key;
    private final long ExpirationMilliseconds = 3600000L;

    public JwtProvider() {
        this.key = Keys.hmacShaKeyFor(Decoders.BASE64.decode("tmp"));
    }

    @Override
    public String create(CertificationDto dto) {
        Date expiration = new Date(new Date().getTime() + ExpirationMilliseconds);

        return Jwts.builder()
                .claim("userid", dto.getUserId())
                .signWith(key, SignatureAlgorithm.HS512)
                .setExpiration(expiration)
                .compact();
    }

    @Override
    public void validate(String token) {
        Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJwt(token);
    }
}
