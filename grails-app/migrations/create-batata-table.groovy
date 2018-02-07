databaseChangeLog = {
    changeSet(author: "renan (generated)", id: "1517953743571-1") {
        createTable(tableName: "batata") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "batataPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "color", type: "VARCHAR(255)")
        }
    }
}