insert into
    therapists (id, name, specialization)
values
(1, 't1', 'spec1'),
(2, 't2', 'spec2'),
(3, 't3', 'spec3');

insert into
    patients (id, name, therapists_id)
values
(1, 'p1', 1),
(2, 'p2', 2),
(3, 'p3', 2);