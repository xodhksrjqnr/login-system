package com.taewan.login_api_server.provider.jwt;

import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;
import com.taewan.login_api_server.provider.TokenProvider;
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
    private final String Secret = "thisissamplekey123456780";

    public JwtProvider() {
        this.key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(Secret + Secret + Secret + Secret));
    }

    @Override
    public String create(CertificationDto dto) {
        Date expiration = new Date(new Date().getTime() + ExpirationMilliseconds);

        return Jwts.builder()
                .claim("userid", dto.getUserId())
                .claim("role", dto.getRole().name())
                .signWith(key, SignatureAlgorithm.HS512)
                .setExpiration(expiration)
                .compact();
    }

    @Override
    public void validate(String token) {
        Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token);
    }
}
