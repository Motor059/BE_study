package com.example.shop.common.message;

public class ErrorMessage {
    // member 관련 error 메시지
    public static final String MEMBER_NOT_FOUND = "회원을 찾을 수 없습니다.";
    public static final String MEMBER_ALREADY_EXISTS = "이미 존재하는 로그인 아이디입니다.";
    public static final String LOGIN_ID_NOT_NULL = "로그인 아이디는 필수입니다.";
    public static final String LOGIN_ID_SIZE = "로그인 아이디는 4자 이상 20자 이하입니다.";
    public static final String LOGIN_PASSWORD_SIZE = "로그인 패스워드는 8자 이상 20자 이하입니다.";
    public static final String PHONE_NUMBER_PATTURN = "전화번호 형식은 010-xxxx-xxxx입니다.";
    public static final String ADDRESS_SIZE = "주소는 1자 이상 255자 이하입니다.";
    public static final String PASSWORD_NOT_FOUND = "비밀번호는 필수입니다.";
    public static final String PHONE_NUMBER_NOT_FOUND = "전화번호는 필수입니다.";
    public static final String ADDRESS_NOT_FOUND = "주소는 필수입니다.";

    // product 관련 error 메시지
    public static final String PRODUCT_NOT_FOUND = "상품을 찾을 수 없습니다.";
    public static final String PRODUCT_NAME_NOT_BLANK = "상품 이름은 필수입니다.";
    public static final String PRODUCT_PRICE_MIN = "상품 가격은 0원 이상이어야 합니다.";
    public static final String PRODUCT_STOCK_MIN = "상품 재고는 0개 이상이어야 합니다.";

    // order 관련 error 메시지
    public static final String ORDER_NOT_FOUND = "주문 내역을 찾을 수 없습니다.";
    public static final String ORDER_MEMBER_NOT_NULL = "회원 ID는 필수입니다.";
    public static final String ORDER_PRODUCT_NOT_NULL = "상품 ID는 필수입니다.";
    public static final String ORDER_QUANTITY_MIN = "주문 수량은 1개 이상이어야 합니다.";
    public static final String ORDER_STATUS_NOT_BLANK = "주문 상태는 필수입니다.";
}
