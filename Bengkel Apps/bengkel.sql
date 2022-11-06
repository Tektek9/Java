/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     1/7/2019 9:42:49 PM                          */
/*==============================================================*/




/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
create table CUSTOMER 
(
   ID_CUSTOMER          varchar(10)                    not null,
   NAMA_CUSTOMER        varchar(15)                    null,
   JENKEL_CUSTOMER      varchar(6)                     null,
   ALAMAT_CUSTOMER      varchar(30)                    null,
   constraint PK_CUSTOMER primary key (ID_CUSTOMER)
);

/*==============================================================*/
/* Index: CUSTOMER_PK                                           */
/*==============================================================*/
create unique index CUSTOMER_PK on CUSTOMER (
ID_CUSTOMER ASC
);

/*==============================================================*/
/* Table: SPAREPART                                             */
/*==============================================================*/
create table SPAREPART 
(
   ID_SPAREPART         varchar(10)                    not null,
   NAMA_SPAREPART       varchar(30)                    null,
   JUMLAH_SPAREPART     varchar(10)                    null,
   constraint PK_SPAREPART primary key (ID_SPAREPART)
);

/*==============================================================*/
/* Index: SPAREPART_PK                                          */
/*==============================================================*/
create unique index SPAREPART_PK on SPAREPART (
ID_SPAREPART ASC
);

/*==============================================================*/
/* Table: TRANSAKSI                                             */
/*==============================================================*/
create table TRANSAKSI 
(
   ID_TRANSAKSI         varchar(10)                    not null,
   ID_CUSTOMER          varchar(10)                    null,
   ID_SPAREPART         varchar(10)                    null,
   NAMA_TRANSAKSI       varchar(15)                    null,
   TOTAL_HARGA_TRANSAKSI varchar(12)                    null,
   TANGGAL_TRANSAKSI    date                           null,
   constraint PK_TRANSAKSI primary key (ID_TRANSAKSI)
);

/*==============================================================*/
/* Index: TRANSAKSI_PK                                          */
/*==============================================================*/
create unique index TRANSAKSI_PK on TRANSAKSI (
ID_TRANSAKSI ASC
);

/*==============================================================*/
/* Index: BAYAR2_FK                                             */
/*==============================================================*/
create index BAYAR2_FK on TRANSAKSI (
ID_CUSTOMER ASC
);

/*==============================================================*/
/* Table: "USER"                                                */
/*==============================================================*/
create table USER 
(
   USERNAME             varchar(10)                    null,
   PASSWORD             varchar(10)                    null
);

alter table TRANSAKSI
   add constraint FK_TRANSAKS_MELAKUKAN_CUSTOMER foreign key (ID_CUSTOMER)
      references CUSTOMER (ID_CUSTOMER)
      on update restrict
      on delete restrict;

alter table TRANSAKSI
   add constraint FK_TRANSAKS_PERLU_SPAREPAR foreign key (ID_SPAREPART)
      references SPAREPART (ID_SPAREPART)
      on update restrict
      on delete restrict;

