INSERT INTO users (id, name, email, password, role, created_at)
VALUES 
  (gen_random_uuid(), 'ADMIN', 'admin@admin.com', '$2a$12$Z55KzYwMvvLd60UDmiQVxeO4Q7ritZHL2xQtxaIVWPTEi9r8erF3G', 'ADMIN', CURRENT_TIMESTAMP);
