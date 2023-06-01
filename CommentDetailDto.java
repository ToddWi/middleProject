package com.mid.alcohol.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CommentDetailDto {
    
    private String nickname;
    private Timestamp time; 
    private String content;
    
    public static CommentDetailDto.
}
