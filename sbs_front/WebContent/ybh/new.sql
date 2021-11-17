insert into sbs_order(id, book_seq, order_date, address, price)
values('test', '1', sysdate(), '가리봉동', '22500')

insert into sbs_wishlist(id, book_seq, book_count,price, delivery_fee)
values('test', '1',3, 22500, 2500)

insert into sbs_wishlist(id, book_seq, book_count,price, delivery_fee)
values('yunbo3', '1',3, 22500, 2500)

insert into sbs_wishlist(id, book_seq, book_count,price, delivery_fee)
values('yunbo3', '2',5, 5000, 0)

insert into sbs_wishlist(id, book_seq, book_count,price, delivery_fee)
values('yunbo3', '3',2, 1000, 0)

select * from sbs_wishlist;
select * from sbs_book;

select title from sbs_book; 

				$("#book_count").html(resp.book_count);
				$("#book_seq").html(resp.book_seq);
				$("#delivery_fee").html(resp.delivery_fee);
				$("#id").html(resp.id);
				$("#price").html(resp.price);
				$("#seq").html(resp.seq);

				
				