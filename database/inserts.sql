INSERT INTO disciplines (id, discipline) VALUES
(gen_random_uuid(), 'Matemática'),
(gen_random_uuid(), 'Português'),
(gen_random_uuid(), 'História'),
(gen_random_uuid(), 'Geografia');

INSERT INTO subjects (id, "discipline_id", subject) VALUES
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Matemática'), 'Álgebra'),
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Matemática'), 'Geometria'),

(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Português'), 'Gramática'),
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Português'), 'Interpretação de Texto'),

(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'História'), 'Princípios da história'),
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'História'), 'Goiania'),

(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Geografia'), 'Relevo'),
(gen_random_uuid(), (SELECT id FROM disciplines WHERE discipline = 'Geografia'), 'Clima');

