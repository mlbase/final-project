create table sbs_user(
	seq int(9) not null auto_increment primary key,
	id varchar(50) not null,
	pwd varchar(100) not null,
	email varchar(500) not null,
	following varchar(2000) null,
	follower varchar(2000) null,
	nickname varchar(50) not null,
	birth date not null,
	name varchar(50) not null,
	address varchar(500) not null,
	reg_date date not null,
	auth int(9) not null
)

create table sbs_message(
	seq int(9) not null auto_increment primary key,
	send_id varchar(50) not null,
	receive_id varchar(50) not null,
	content varchar(1000) not null,
	reg_date datetime not null
)

ALTER TABLE sbs_user ADD UNIQUE uk_id (id);

ALTER TABLE sbs_user ADD UNIQUE uk_nickname (nickname);

ALTER TABLE sbs_message add foreign key(send_id) references sbs_user(id);

ALTER TABLE sbs_message add foreign key(receive_id) references sbs_user(id);

/*drop table sbs_message;*/ 
/*drop table sbs_feed;*/
create table sbs_feed(
	seq int(9) not null auto_increment primary key,
	nickname varchar(50) not null,
	content varchar(2000) null,
	filename varchar(200) null,
	tag varchar(2000) null,
	reg_date datetime not null
)

ALTER TABLE sbs_feed add foreign key(nickname) references sbs_user(nickname);

create table sbs_comment(
	seq int(9) not null auto_increment primary key,
	nickname varchar(50) not null,
	content varchar(2000) null,
	feed_seq int(9) not null,
	reg_date datetime not null
)

ALTER TABLE sbs_comment add foreign key(feed_seq) references sbs_feed(seq);
ALTER TABLE sbs_comment add foreign key(nickname) references sbs_user(nickname);

create table sbs_like(
	seq int(9) not null auto_increment primary key,
	nickname varchar(50) not null,
	is_like bit(1) not null,
	comment_seq int(9) null,
	feed_seq int(9) null
)

ALTER TABLE sbs_like add foreign key(nickname) references sbs_user(nickname);
ALTER TABLE sbs_like add foreign key(comment_seq) references sbs_comment(seq);
ALTER TABLE sbs_like add foreign key(comment_seq) references sbs_feed(seq);

-------------------------------------------------------------------------------

create table sbs_book(
	seq int(9) not null auto_increment primary key,
	title varchar(500) not null,
	filename varchar(200) null,
	writer varchar(500) not null,
	publisher varchar(500) not null,
	price int(20) not null,
	isbn int(100) not null,
	content varchar(5000) null,
	reg_date datetime not null,
	publish_date date null,
	sort varchar(50) null,
	genre varchar(200) null,
	delivery_fee int(20) null,
	amount int(20) null
)

create table sbs_order(
	seq int(9) not null auto_increment primary key,
	id varchar(50) not null,
	book_seq int(9) not null,
	order_date datetime not null,
	address varchar(500) not null,
	delivery_fee int(20) null,
	book_count int(20) null,
	price int(20) not null,
	card_num varchar(200) null
)

ALTER TABLE sbs_order add foreign key(book_seq) references sbs_book(seq);
ALTER TABLE sbs_order add foreign key(id) references sbs_user(id);

------------------------------------------------------------------------------
ALTER TABLE sbs_like
DROP FOREIGN KEY sbs_like_ibfk_2;

ALTER TABLE sbs_like
DROP FOREIGN KEY sbs_like_ibfk_3;

ALTER TABLE sbs_like add foreign key(comment_seq) references sbs_comment(seq);

ALTER TABLE sbs_like add foreign key(feed_seq) references sbs_feed(seq);
---------------------------------------------------------------------------


select * from sbs_user;

alter table sbs_user
add column(ROLE VARCHAR(50) NOT NULL)

     SELECT TA.*
		  FROM (SELECT RANK() OVER(PARTITION BY REG_DATE ORDER BY 
		  			(SELECT COUNT(*) FROM SBS_LIKE AS SL, SBS_FEED AS SF WHERE SL.FEED_SEQ=SF.SEQ) DESC) AS RNUM
		             , (SELECT COUNT(*) FROM SBS_LIKE AS SL, SBS_FEED AS SF WHERE SL.FEED_SEQ=SF.SEQ) 
		             AS LNUM
		             , COUNT(1) OVER() AS TOTCNT
		             , SEQ
		             , NICKNAME
		             , CONTENT
		             , FILENAME
		             , TAG
		             , REG_DATE
		      FROM SBS_FEED FD
		)TA
		WHERE RNUM >= 1
		  AND RNUM <= 10
		  
		  select ta.*
  from (select 
               fd.*
               ,ROW_NUMBER() OVER(ORDER BY fl.like_cnt desc, fd.reg_date desc) as rnum
          from hr.sbs_feed fd     
          left outer join 
          (select count(1) as like_cnt, feed_seq
                 from hr.sbs_like
                group by feed_seq) fl
          on fd.seq = fl.feed_seq)ta 
  where rnum >=1
    and rnum <=10;
/*
UPDATE SBS_USER
SET ROLE='ROLE_USER'
WHERE SEQ=1
*/