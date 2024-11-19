CREATE TABLE IF NOT EXISTS lead (
                                    id SERIAL PRIMARY KEY,
                                    name VARCHAR(255) NOT NULL,
    status VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
CREATE TABLE IF NOT EXISTS activity (
                                        id SERIAL PRIMARY KEY,
                                        description TEXT NOT NULL,
                                        date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                        lead_id BIGINT,
                                        FOREIGN KEY (lead_id) REFERENCES lead(id) ON DELETE CASCADE
    );
