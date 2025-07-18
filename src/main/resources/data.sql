INSERT INTO book (id, title, author, price, description) VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', 10.99, 'A novel set in the Roaring Twenties.'),
(2, '1984', 'George Orwell', 8.99, 'A dystopian novel about totalitarianism.'),
(3, 'To Kill a Mockingbird', 'Harper Lee', 12.99, 'A novel about racial injustice in the Deep South.'),
(4, 'Pride and Prejudice', 'Jane Austen', 9.99, 'A romantic novel that critiques the British landed gentry.'),
(5, 'The Catcher in the Rye', 'J.D. Salinger', 10.99, 'A story about teenage angst and alienation.');

INSERT INTO cart (id, userId) VALUES
(1, 1),
(2, 2);

INSERT INTO order (id, userId, orderDate) VALUES
(1, 1, '2023-10-01'),
(2, 2, '2023-10-02');