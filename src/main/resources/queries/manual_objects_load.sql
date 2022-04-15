insert into
    therapists (id, name)
values
(1, 't1'),
(2, 't2'),
(3, 't3');

insert into
    patients (id, name, therapist_id)
values
(1, 'p1', 1),
(2, 'p2', 2),
(3, 'p3', 2);

insert into
    activities (id, activity_name, patient_id)
values
(1, 'activity1', 1),
(2, 'activity2', 2),
(3, 'activity3', 2),
(4, 'activity4', 3),
(5, 'activity5', 2);

insert into
    moodchecks (id, date_time, mood, self_esteem, activity_id)
values
(1, now(), 6, 7, 1),
(2, now(), 4, 8, 2),
(3, now(), 5, 5, 2);