INSERT INTO disciplines (id, discipline) VALUES
(gen_random_uuid(), 'Informática'),
(gen_random_uuid(), 'Português'),
(gen_random_uuid(), 'História de Goiás'),
(gen_random_uuid(), 'Conhecimento Específico');

INSERT INTO subjects (id, "discipline_id", subject) VALUES
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Português'), 'Gramática'),
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Português'), 'Interpretação de Texto');