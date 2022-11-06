/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     5/24/2018 7:03:51 AM                         */
/*==============================================================*/

drop table if exists ANGSURAN;

drop table if exists BLOK;

drop table if exists CUSTOMER;

drop table if exists PEGAWAI;

drop table if exists TUNAI;

drop table if exists TYPE_RUMAH;

/*==============================================================*/
/* Table: ANGSURAN                                              */
/*==============================================================*/
create table ANGSURAN
(
   KD_ANGSURAN          varchar(8) not null  comment '',
   KD_PENJUALAN         varchar(8)  comment '',
   KD_PEGAWAI           varchar(8)  comment '',
   TGL_ANGSURAN         date  comment '',
   JUMLAH_ANGSURAN      varchar(12)  comment '',
   primary key (KD_ANGSURAN)
);

/*==============================================================*/
/* Table: BLOK                                                  */
/*==============================================================*/
create table BLOK
(
   BLOK                 varchar(4) not null  comment '',
   ALAMAT_RUMAH         varchar(100)  comment '',
   primary key (BLOK)
);

/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
create table CUSTOMER
(
   KD_CUSTOMER          varchar(8) not null  comment '',
   NAMA_CUSTOMER        varchar(50)  comment '',
   ALAMAT_CUSTOMER      varchar(100)  comment '',
   TELP_CUSTOMER        varchar(13)  comment '',
   primary key (KD_CUSTOMER)
);

/*==============================================================*/
/* Table: PEGAWAI                                               */
/*==============================================================*/
create table PEGAWAI
(
   KD_PEGAWAI           varchar(8) not null  comment '',
   NAMA_PEGAWAI         varchar(50)  comment '',
   ALAMAT_PEGAWAI       varchar(100)  comment '',
   TELP_PEGAWAI         varchar(13)  comment '',
   JABATAN              varchar(20)  comment '',
   primary key (KD_PEGAWAI)
);

/*==============================================================*/
/* Table: RUMAH                                                 */
/*==============================================================*/
create table RUMAH
(
   NO_RUMAH             varchar(4) not null  comment '',
   BLOK                 varchar(4)  comment '',
   KD_TYPE              varchar(5)  comment '',
   STATUS               varchar(11)  comment '',
   primary key (NO_RUMAH)
);

/*==============================================================*/
/* Table: TRANSJUAL                                             */
/*==============================================================*/
create table TRANSJUAL
(
   KD_PENJUALAN         varchar(8) not null  comment '',
   KD_CUSTOMER          varchar(8)  comment '',
   NO_RUMAH             varchar(4)  comment '',
   KD_PEGAWAI           varchar(8)  comment '',
   TGL_TRANSJUAL        date  comment '',
   TOTAL                varchar(12)  comment '',
   primary key (KD_PENJUALAN)
);

/*==============================================================*/
/* Table: TUNAI                                                 */
/*==============================================================*/
create table TUNAI
(
   KD_PEGAWAI           varchar(8)  comment '',
   KD_PENJUALAN         varchar(8)  comment '',
   TGL_BAYAR            date  comment '',
   KD_BAYARTUNAI        varchar(8)  comment ''
);

/*==============================================================*/
/* Table: TYPE_RUMAH                                            */
/*==============================================================*/
create table TYPE_RUMAH
(
   KD_TYPE              varchar(5) not null  comment '',
   LUAS_BANGUNAN        varchar(12)  comment '',
   LUAS_TANAH           varchar(12)  comment '',
   HARGA                float(12,0)  comment '',
   primary key (KD_TYPE)
);

alter table ANGSURAN add constraint FK_ANGSURAN_RELATIONS_PEGAWAI foreign key (KD_PEGAWAI)
      references PEGAWAI (KD_PEGAWAI) on delete restrict on update restrict;

alter table ANGSURAN add constraint FK_ANGSURAN_RELATIONS_TRANSJUA foreign key (KD_PENJUALAN)
      references TRANSJUAL (KD_PENJUALAN) on delete restrict on update restrict;

alter table RUMAH add constraint FK_RUMAH_RELATIONS_TYPE_RUM foreign key (KD_TYPE)
      references TYPE_RUMAH (KD_TYPE) on delete restrict on update restrict;

alter table RUMAH add constraint FK_RUMAH_RELATIONS_BLOK foreign key (BLOK)
      references BLOK (BLOK) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_TRANSJUA_RELATIONS_RUMAH foreign key (NO_RUMAH)
      references RUMAH (NO_RUMAH) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_TRANSJUA_RELATIONS_CUSTOMER foreign key (KD_CUSTOMER)
      references CUSTOMER (KD_CUSTOMER) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_TRANSJUA_RELATIONS_PEGAWAI foreign key (KD_PEGAWAI)
      references PEGAWAI (KD_PEGAWAI) on delete restrict on update restrict;

alter table TUNAI add constraint FK_TUNAI_RELATIONS_PEGAWAI foreign key (KD_PEGAWAI)
      references PEGAWAI (KD_PEGAWAI) on delete restrict on update restrict;

alter table TUNAI add constraint FK_TUNAI_RELATIONS_TRANSJUA foreign key (KD_PENJUALAN)
      references TRANSJUAL (KD_PENJUALAN) on delete restrict on update restrict;

