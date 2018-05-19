CREATE DATABASE QLKaraoke
go
USE QLKaraoke
GO
--DROP DATABASE QLKaraoke

CREATE TABLE NHANVIEN(
	MANV INT IDENTITY(101,1) NOT NULL,
	HOTEN NVARCHAR(50),
	GIOITINH NVARCHAR(3) CHECK (GIOITINH IN (N'Nam', N'Nữ')),
	NGAYSINH DATE,
	DIACHI NVARCHAR(200),
	CMND VARCHAR(10) NOT NULL UNIQUE,
	SDT VARCHAR(12) NOT NULL UNIQUE,
	LUONG INT CHECK (LUONG >=0),
	CONSTRAINT PK_NHANVIEN PRIMARY KEY (MANV)
)

CREATE TABLE TAIKHOAN(
	MANV INT NOT NULL,
	TENTK VARCHAR(50) NOT NULL,
	MATKHAU VARCHAR(50) NOT NULL,
	CONSTRAINT PK_TAIKHOAN PRIMARY KEY (TENTK)
)

CREATE TABLE KHACHHANG(
	MAKH INT IDENTITY(10001,1) NOT NULL,
	HOTEN NVARCHAR(50),
	GIOITINH NVARCHAR(5) CHECK (GIOITINH IN (N'Nam', N'Nữ')),
	NGAYSINH DATE,
	DIACHI NVARCHAR(200),
	CMND VARCHAR(10) NOT NULL UNIQUE,
	SDT VARCHAR(12) NOT NULL UNIQUE,
	CONSTRAINT PK_KHACHHANG PRIMARY KEY (MAKH)
)

CREATE TABLE LOAIPHONG(
	MALOAIPHONG INT IDENTITY(2001,1) NOT NULL,
	MOTA NVARCHAR(200),
	SUCCHUA INT CHECK(SUCCHUA >0),
	GIAPHONG INT CHECK(GIAPHONG >= 0),
	TENLOAI NVARCHAR(20)
	CONSTRAINT PK_LOAIPHONG PRIMARY KEY (MALOAIPHONG)
)

CREATE TABLE PHONGHAT(
	MAPHONG INT IDENTITY(1,1) NOT NULL,
	MALOAIPHONG INT,
	TINHTRANG NVARCHAR(50) CHECK (TINHTRANG IN (N'Đang sử dụng', N'Đã đặt trước', N'Còn trống')),
	CONSTRAINT PK_PHONGHAT PRIMARY KEY (MAPHONG)
)

CREATE TABLE DONTHANHTOAN(
	MADON INT IDENTITY(1,1) NOT NULL,
	MANV INT,
	MAKH INT,
	MAPHONG INT,
	GIAPHONG INT CHECK (GIAPHONG >=0),
	THOIGIANBD DATETIME,
	THOIGIANKT DATETIME,
	MAKM VARCHAR(10),
	TINHTRANG NVARCHAR(20) CHECK (TINHTRANG IN (N'Đã thanh toán', N'Chưa thanh toán')),
	CONSTRAINT PK_DONTHANHTOAN PRIMARY KEY (MADON)
)
-- Lưu ý: Thời gian bắt đầu < Thời gian kết thúc

CREATE TABLE LOAIDICHVU(
	MALOAIDV INT IDENTITY(301,1) NOT NULL,
	TENLOAIDV NVARCHAR(20),
	CONSTRAINT PK_LOAIDICHVU PRIMARY KEY (MALOAIDV)
)

CREATE TABLE DICHVU(
	MADV INT IDENTITY(3001,1) NOT NULL,
	MALOAIDV INT,
	TENDV NVARCHAR(50),
	DONGIA INT CHECK(DONGIA >=0),
	CONSTRAINT PK_DICHVU PRIMARY KEY (MADV)
)

CREATE TABLE CHITIETDICHVU(
	MADON INT NOT NULL,
	STT INT NOT NULL,
	MADV INT,
	DONGIA INT CHECK (DONGIA >=0),
	SOLUONG INT CHECK (SOLUONG >=0),
	CONSTRAINT PK_CHITIETDICHVU PRIMARY KEY (MADON, STT)
)

CREATE TABLE KHUYENMAI(
	MAKM VARCHAR(10) NOT NULL,
	TENKM NVARCHAR(50),
	GIATRIKM INT CHECK (GIATRIKM >=0),
	THOIGIANBD DATE,
	THOIGIANKT DATE,
	CONSTRAINT PK_KHUYENMAI PRIMARY KEY (MAKM)
)
-- Lưu ý: Thời gian bắt đầu < Thời gian kết thúc

-------------------------------------------------------------------------
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV)

ALTER TABLE DONTHANHTOAN ADD CONSTRAINT FK_DONTHANHTOAN_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV)
ALTER TABLE DONTHANHTOAN ADD CONSTRAINT FK_DONTHANHTOAN_KHACHHANG FOREIGN KEY (MAKH) REFERENCES KHACHHANG (MAKH)
ALTER TABLE DONTHANHTOAN ADD CONSTRAINT FK_DONTHANHTOAN_PHONGHAT FOREIGN KEY (MAPHONG) REFERENCES PHONGHAT (MAPHONG)
ALTER TABLE DONTHANHTOAN ADD CONSTRAINT FK_DONTHANHTOAN_KHUYENMAI FOREIGN KEY (MAKM) REFERENCES KHUYENMAI (MAKM)

ALTER TABLE DICHVU ADD CONSTRAINT FK_DICHVU_LOAIDICHVU FOREIGN KEY (MALOAIDV) REFERENCES LOAIDICHVU (MALOAIDV)

ALTER TABLE CHITIETDICHVU ADD CONSTRAINT FK_CHITIETDICHVU_DONTHANHTOAN FOREIGN KEY (MADON) REFERENCES DONTHANHTOAN (MADON)
ALTER TABLE CHITIETDICHVU ADD CONSTRAINT FK_CHITIETDICHVU_DICHVU FOREIGN KEY (MADV) REFERENCES DICHVU (MADV)

ALTER TABLE dbo.PHONGHAT ADD CONSTRAINT FK_PHONGHAT_LOAIPHONG FOREIGN KEY (MALOAIPHONG) REFERENCES dbo.LOAIPHONG(MALOAIPHONG)








--------------data for NHANVIEN------------------------
INSERT INTO dbo.NHANVIEN VALUES  ( N'Nguyễn Thanh Trí' , N'Nam' , '1997-02-03' , N'453 Lê Văn Sỹ' , '025113114' , '0935334000' ,  4000000)
INSERT INTO dbo.NHANVIEN VALUES  ( N'Nguyễn Văn Tú' , N'Nam' , '1997-12-29' , N'KTX Trần Hưng Đạo' , '291150550' , '0969795220' ,  5000000)
INSERT INTO dbo.NHANVIEN VALUES  ( N'Huỳnh Trọng Thoại' , N'Nữ' , '1997-01-30' , N'143 Cầu Giấy' , '028365444' , '0935845900' ,  5000000)
INSERT INTO dbo.NHANVIEN VALUES  ( N'Nhung Gumiho' , N'Nữ' , '1994-07-18' , N'31 Nơ Trang Long' , '145942153' , '0981322777' ,  4000000)


--------------data for TAIKHOAN
INSERT INTO dbo.TAIKHOAN VALUES  ( 101,'NV001', '123456')
INSERT INTO dbo.TAIKHOAN VALUES  ( 102,'NV002', '123456')
INSERT INTO dbo.TAIKHOAN VALUES  ( 103,'NV003', '123456')
INSERT INTO dbo.TAIKHOAN VALUES  ( 104,'NV004', '123456')
INSERT INTO dbo.TAIKHOAN VALUES  ( 105,'QL001', '123456')


--------------data for KHACHHANG-----------------------------------
INSERT INTO dbo.KHACHHANG (HOTEN ,GIOITINH ,NGAYSINH ,DIACHI ,CMND ,SDT) VALUES 
( N'Bích Thị Nụ', N'Nữ', '1990-02-25', N'123 An Dương Vương', '148526111', '0954852655' ),
( N'Linda Trần', N'Nữ', '1991-05-30', N'58 Lý Thái Tổ', '354848448', '0964845141' ),
( N'Kevin Khánh', N'Nam', '1993-08-21', N'117/21 Bàn Cờ, Q3 TPHCM', '421554644', '01887016541' ),
( N'Nguyễn Sơn Tùng', N'Nam', '1992-12-11', N'54/15 Nguyễn Đình Chiểu, Q3 TPHCM', '753951842', '0986275319' )


--------------data for LOAIPHONG----------------------------------
INSERT INTO dbo.LOAIPHONG ( TENLOAI, MOTA, SUCCHUA, GIAPHONG ) VALUES
( N'Thường', N'2 loa lớn, 1 màn hình 58 inch', 10, 150000 ),
( N'VIP', N'4 loa lớn, 2 màn hình 58 inch, chọn bài bằng giọng nói', 16, 300000 ),
( N'Sự kiện', N'4 loa lớn, 2 màn hình 58 inch, có nhân viên hỗ trợ riêng', 20, 500000 )


--------------data for PHONGHAT------------------------------------
INSERT INTO dbo.PHONGHAT(MALOAIPHONG,  TINHTRANG) VALUES 
(2001, N'Còn trống'),
(2002, N'Còn trống'),
(2003, N'Còn trống'),
(2001, N'Đang sử dụng')




--------------data for DONTHANHTOAN--------------------------------
INSERT INTO dbo.DONTHANHTOAN ( MANV ,MAKH , MAPHONG ,GIAPHONG , THOIGIANBD ,THOIGIANKT ,MAKM ,TINHTRANG) VALUES 
( 101, 10001, 1, 150000, '2018-05-19 09:00:00', '2018-05-19 11:00:00', NULL, N'Đã thanh toán' ),
( 102, 10002, 2, 300000, '2018-05-12 08:00:00', '2018-05-12 14:00:00', NULL, N'Đã thanh toán' ),
( 103, 10003, 3, 500000, '2018-05-19 12:00:00', '2018-05-19 15:00:00', NULL, N'Chưa thanh toán' ),
( 101, 10004, 2, 300000, '2018-05-13 14:00:00', '2018-05-13 17:00:00', 'SNVV2018', N'Đã thanh toán' )



--------------data for LOAIDICHVU----------------------------------
INSERT INTO dbo.LOAIDICHVU VALUES 
( N'Đồ ăn'),
( N'Đồ uống'),
( N'Khác')


--------------data for DICHVU--------------------------------------
INSERT INTO dbo.DICHVU ( MALOAIDV, TENDV, DONGIA ) VALUES 
( 301, N'Nui xào bò', 25000 ),
( 302, N'Mì xào trứng chiên', 20000 ),
( 302, N'Sting dâu', 12000 ),
( 302, N'Bò húc', 14000 ),
( 303, N'Khăn lạnh', 5000 ),
( 301, N'Trái cây', 35000 ),
( 302, N'Nước suối', 8000 )


--------------data for CHITIETDICHVU-------------------------------
INSERT INTO dbo.CHITIETDICHVU ( MADON, STT, MADV, DONGIA, SOLUONG ) VALUES 
( 1, 1, 3001, 25000, 2 ),
( 1, 2, 3002, 20000, 3 ),
( 1, 3, 3005, 5000, 1 ),
( 2, 1, 3002, 20000, 5 ),
( 2, 2, 3007, 8000, 8 ),
( 3, 1, 3004, 14000, 3 ),
( 3, 2, 3003, 12000, 1 )


--------------data for KHUYENMAI-----------------------------------
INSERT INTO dbo.KHUYENMAI ( MAKM , TENKM , GIATRIKM , THOIGIANBD ,THOIGIANKT ) VALUES  
( 'VALEN2018', N'Valentine 2018', 50000, '2018-02-13', '2018-02-15' ),
( 'SN2018', N'Kỷ niệm 1 năm hoạt động', 100000, '2018-05-19', '2018-05-26' ),
( 'GS2018', N'Giáng sinh 2018', 50000, '2018-12-22', '2018-12-29' ),
( 'SNVV2018', N'Sinh nhật vui vẻ', 50000, '2018-01-01', '2018-12-31')


SELECT * FROM dbo.NHANVIEN
SELECT * FROM dbo.TAIKHOAN
SELECT * FROM dbo.KHACHHANG

SELECT * FROM dbo.LOAIPHONG
SELECT * FROM dbo.PHONGHAT

SELECT * FROM dbo.LOAIDICHVU
SELECT * FROM dbo.DICHVU

SELECT * FROM dbo.KHUYENMAI

SELECT * FROM dbo.DONTHANHTOAN
SELECT * FROM dbo.CHITIETDICHVU