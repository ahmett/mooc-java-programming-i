public class ArchiveItem {

    private String name;

    private String identifier;

    public ArchiveItem(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchiveItem that = (ArchiveItem) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
