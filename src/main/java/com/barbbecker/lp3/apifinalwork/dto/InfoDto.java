package com.barbbecker.lp3.apifinalwork.dto;

public class InfoDto {

    private ZenDto zenDto;
    private WheatherDto wheatherDto;
    private SecretDto secretDto;

    public ZenDto getZenDto() {
        return zenDto;
    }

    public void setZenDto(ZenDto zenDto) {
        this.zenDto = zenDto;
    }

    public WheatherDto getWheatherDto() {
        return wheatherDto;
    }

    public void setWheatherDto(WheatherDto wheatherDto) {
        this.wheatherDto = wheatherDto;
    }

    public SecretDto getSecretDto() {
        return secretDto;
    }

    public void setSecretDto(SecretDto secretDto) {
        this.secretDto = secretDto;
    }
}
