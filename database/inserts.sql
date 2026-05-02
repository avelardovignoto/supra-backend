-- Ativar extensão UUID
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
uuid_generate_v4()

INSERT INTO disciplines (id, discipline) VALUES
(uuid_generate_v4(), 'Matemática'),
(uuid_generate_v4(), 'Português'),
(uuid_generate_v4(), 'História'),
(uuid_generate_v4(), 'Geografia');

INSERT INTO subjects (id, disciplineId, subject) VALUES
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', 'Álgebra'),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', 'Geometria'),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', 'Gramática'),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', 'Interpretação de Texto'),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', 'Princípios da história'),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', 'Goiania'),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', 'Relevo'),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', 'Clima');

INSERT INTO question (id, disciplineId, question, context) VALUES
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', '1 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', '2 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', '3 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', '4 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Matemática', '5 O que é?', null),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', '6 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', '7 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', '8 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', '9 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Português', '10 O que é?', "A vida é bela"),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', '11 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', '12 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', '13 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', '14 O que é?', "A vida é bela"),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'História', '15 O que é?', "A vida é bela"),

(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', '16 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', '17 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', '18 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', '19 O que é?', null),
(uuid_generate_v4(), SELECT id FROM disciplines WHERE discipline = 'Geografia', '20 O que é?', null),

INSERT INTO option (id, questionId, option, isCorrect) VALUES
(uuid_generate_v4(), SELECT id FROM question WHERE question = 'Matemática', 'A', true),
(uuid_generate_v4(), SELECT id FROM question WHERE question = 'Matemática', 'B', false),
(uuid_generate_v4(), SELECT id FROM question WHERE question = 'Matemática', 'C', false),
(uuid_generate_v4(), SELECT id FROM question WHERE question = 'Matemática', 'D', false),

