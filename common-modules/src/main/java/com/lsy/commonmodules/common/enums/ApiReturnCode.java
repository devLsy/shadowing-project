package com.lsy.commonmodules.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiReturnCode {

    /* ===== 2XX ===== */
    NO_DATA("데이터가 없습니다.", 204),

    /* ===== 4XX - Common Errors ===== */
    BAD_REQUEST("잘못된 요청 본문 형식입니다.", 400),
    INVALID_SORT_FIELD("잘못된 정렬 필드입니다.", 400),
    METHOD_NOT_ALLOWED("허용되지 않은 HTTP 메서드입니다.", 405),
    UNSUPPORTED_MEDIA_TYPE("지원하지 않는 미디어 타입입니다.", 415),

    /* ===== 4XX - Auth/Token Errors ===== */
    EXPIRED_TOKEN_ERROR("만료된 토큰입니다.", 401),
    UNAUTHORIZED_ERROR("인증이 필요합니다.", 401),
    INVALID_TOKEN_ERROR("유효하지 않은 토큰입니다.", 401),
    FORBIDDEN_ERROR("접근 권한이 없습니다.", 403),

    /* ===== 4XX - Resource Not Found ===== */
    NO_DATA_ERROR("데이터가 없습니다.", 404),
    NO_URL_ERROR("잘못된 URL 입니다.", 404),
    LOGIN_ID_FAIL("등록된 아이디가 없습니다.", 404),

    /* ===== 4XX - Login Errors ===== */
    LOGIN_PASSWORD_FAIL("비밀번호가 틀렸습니다.", 401),

    /* ===== 4XX - Conflict Errors ===== */
    ID_CONFLICT("중복된 아이디입니다.", 409),
    PHONE_CONFLICT("중복된 전화번호입니다.", 409),
    EMAIL_CONFLICT("중복된 이메일입니다.", 409),

    /* ===== 4XX - File Errors ===== */
    FILE_REQUIRED("필수 첨부파일이 누락되었습니다.", 400),
    FILE_UPLOAD_ERROR("파일 업로드 중 오류가 발생했습니다.", 404),
    FILE_NOT_FOUND("첨부파일이 없습니다.", 404),
    FILE_SIZE_EXCEEDED("파일 사이즈(10MB)를 초과했습니다.", 413),
    FILE_EXTENSION_NOT_ALLOWED("허용되지 않은 파일 확장자입니다.", 415),

    /* ===== 5XX ===== */
    SERVER_ERROR("서버에서 오류가 발생했습니다.", 500);

    private final String message;
    private final int code;
}
