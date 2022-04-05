package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location>  {
    @Override
    public int compareTo(Location location) {
        if (line == location.line()) {
            return column - location.column();
        }
        return line - location.line();
    }

    @Override
    public String toString() {
        return "line: " + line + ", column: " + column;
    }
}
